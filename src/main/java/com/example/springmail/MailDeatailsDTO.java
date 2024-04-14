package com.example.springmail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailDeatailsDTO {
    private String toMail;
    private String message;
    private String subject;
}
