package ua.oleg.dto;

import javax.validation.constraints.NotNull;

public class PlayerDTO {
	@NotNull
    private String userName;
    @NotNull
    private String password;
    @NotNull
    private String email;
}
