package com.ahmet.controller;

import com.ahmet.dto.request.LoginRequestDto;
import com.ahmet.dto.request.RegisterRequestDto;
import com.ahmet.dto.response.LoginResponseDto;
import com.ahmet.dto.response.RegisterResponseDto;
import com.ahmet.exception.AuthException;
import com.ahmet.exception.ErrorType;
import com.ahmet.repository.entity.Auth;
import com.ahmet.service.AuthService;
import com.ahmet.utility.JwtTokenManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    private final JwtTokenManager jwtTokenManager;

    /**
     * http://localhost:9090/api/v1/auth/getpage
     * @return
     */
    @GetMapping("/getpage")
    public ResponseEntity<String> getPage(){
        return ResponseEntity.ok("Auth Service Ulaştınız.");
    }

    @PostMapping("/login")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<LoginResponseDto> login(@RequestBody @Valid LoginRequestDto dto){
        Optional<Auth> auth = authService.doLogin(dto);
        if(auth.isEmpty())
            return ResponseEntity.ok(LoginResponseDto.builder()
                            .statusCode(4000)
                            .message("Kullanıcı adı veya şifre hatalı")
                    .build());

        return ResponseEntity.ok(LoginResponseDto.builder()
                        .statusCode(2001)
                        .message(jwtTokenManager.createToken(auth.get().getId()).get())
                .build());
    }

    @PostMapping("/register")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<RegisterResponseDto> register(@RequestBody @Valid RegisterRequestDto dto){
        if(!dto.getPassword().equals(dto.getRepassowrd()))
            throw new AuthException(ErrorType.ERROR_PASSWORD);
        authService.register(dto);
        return ResponseEntity.ok(RegisterResponseDto.builder()
                        .statusCode(2000)
                        .message("Kayıt işlemi baraşılır şekilde gerçekleşti. Lütfen E-Pasta" +
                                " adresinize gelen aktivasyon linkine tıklayınız.")
                .build());
    }
}
