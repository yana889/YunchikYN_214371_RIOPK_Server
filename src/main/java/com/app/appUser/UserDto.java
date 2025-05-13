package com.app.appUser;

public record UserDto(
        Long id,
        String username,
        String role,

        String fio,

        String img,

        String date,
        String dateFormatted,

        Long categoryId,
        String categoryName,
        float categorySum,

        int tasksCount,
        int tasksIntensity,

        float income
) {
}
