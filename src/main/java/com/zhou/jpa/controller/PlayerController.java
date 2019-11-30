package com.zhou.jpa.controller;

import com.zhou.jpa.domain.Player;
import com.zhou.jpa.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @Author mac
 * @ClassName PlayerController
 * @Description
 * @Date 2019/11/30 4:58 下午
 */
@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/player/{number}")
    @ResponseBody
    public Player getPlayerInformation(@PathVariable Integer number) {
        Optional<Player> player = playerService.selectPlayer(number);
        if (player.isPresent()) {
            return player.get();
        } else {
            return null;
        }
    }

    @GetMapping("/player")
    @ResponseBody
    public List<Player> getPlayerInformation() {
        return playerService.selectPlayer();
    }

    @PostMapping("/player")
    @ResponseBody
    public Player addPlayerInformation(Player player) {
        return playerService.insertPlayer(player);
    }


    @PutMapping("/player")
    @ResponseBody
    public Player updatePlayerInformation(Player player) {
        return playerService.updatePlayer(player);
    }

    @DeleteMapping("/player/{number}")
    @ResponseBody
    public List<Player> deletePlayerInformation(@PathVariable Integer number) {
        playerService.deletePlayer(number);
        return playerService.selectPlayer();
    }
}
