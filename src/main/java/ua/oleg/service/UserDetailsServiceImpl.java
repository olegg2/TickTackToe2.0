package ua.oleg.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import static org.springframework.util.StringUtils.isEmpty;
import ua.oleg.entity.Player;
import ua.oleg.repository.PlayerRepository;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {
	 private final PlayerRepository playerRepository;

	    @Autowired
	    public UserDetailsServiceImpl(PlayerRepository playerRepository) {
	        this.playerRepository = playerRepository;
	    }

	    @Override
	    @Transactional
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	  

	        if(isEmpty(username)) {
	            throw new UsernameNotFoundException("Username cannot be empty");
	        }

	        Player player = playerRepository.findOneByUsername(username);
	        if (player == null) {
	            throw new UsernameNotFoundException("Player " + username + " doesn't exists");
	        }
	        return new ContextUser(player);
	    }
}
