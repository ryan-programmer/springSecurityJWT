package com.schoolmanagement.sms.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


import java.util.Collections;
import java.util.Set;

import static com.schoolmanagement.sms.model.Permissions.*;

@RequiredArgsConstructor
public enum Role {
    USER(Collections.emptySet()),
    ADMIN(
            Set.of(
                    ADMIN_READ,
                    ADMIN_UPDATE

            )
    );

    @Getter
    private final Set<Permissions> permissions;


}
