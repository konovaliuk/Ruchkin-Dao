package com.pis.Entity;

import java.sql.Date;

public record User(Integer id, String name, String surname, String email, String password) {
}
