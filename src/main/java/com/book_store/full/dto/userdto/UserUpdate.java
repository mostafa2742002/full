package com.book_store.full.dto.userdto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdate {
    private String user_id;
    private String name;
    private String phone;
    private String image;
}
