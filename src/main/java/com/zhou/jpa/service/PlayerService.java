package com.zhou.jpa.service;

import com.zhou.jpa.domain.Player;
import com.zhou.jpa.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Author mac
 * @ClassName PlayerService
 * @Description
 * @Date 2019/11/30 5:00 下午
 */
@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Player insertPlayer(Player player) {
        return playerRepository.save(player);
    }

    public void deletePlayer(Integer number) {
        playerRepository.deleteById(number);
    }

    public Player updatePlayer(Player player) {
        return playerRepository.save(player);
    }

    public List<Player> selectPlayer() {
        return playerRepository.findAll();
    }

    public Optional<Player> selectPlayer(Integer number) {
        return playerRepository.findById(number);
    }

}
