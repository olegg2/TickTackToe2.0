package ua.oleg.service;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import ua.oleg.entity.Player;

public class ContextUser extends User {
	 private final Player player;

	    public ContextUser(Player player) {
	        super(player.getUsername(),
	                player.getPassword(),
	                true,
	                true,
	                true,
	                true,
	                ImmutableSet.of(new SimpleGrantedAuthority("create")));

	        this.player = player;
	    }

	    public Player getPlayer() {
	        return  player;
	    }
}
