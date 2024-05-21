package com.example.lab3.Entity;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @NotNull(message = "Không được để trống name ")
    private String name;
    @NotNull(message = "Không được để trống age ")
    @DecimalMax(value = "30", message = "AGE phải thoả 18 <= age <= 30")
    @DecimalMin(value = "18", message = "AGE phải thoả 18 <= age <= 30")
    private int age;
    @NotNull(message = "Không được để trống classes ")
    private String classes;
    @NotNull(message = "Không được để trống giới tính")
    private Byte gioiTinh;
    @NotNull(message = "Không được để trống phone ")
    private String phone;
    @NotNull(message = "Không được để trống email ")
    private String email;


}
