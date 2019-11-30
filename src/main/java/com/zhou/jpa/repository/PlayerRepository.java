package com.zhou.jpa.repository;

import com.zhou.jpa.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author mac
 * @ClassName PlayerRepository
 * @Description
 * @Date 2019/11/30 4:54 下午
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
