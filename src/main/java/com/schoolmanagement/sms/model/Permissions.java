package com.schoolmanagement.sms.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Permissions {
    ADMIN_READ("admin:read"),
       ADMIN_UPDATE("admin:update");

    @Getter
    private final String permissions;



}
