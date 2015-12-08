package core.dto;

import core.entities.Player;
import core.entities.PlayerRecord;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by tommylii on 08/12/2015.
 */
public class PlayerDto {

    private String name;

    private String comments;
    private final Long id;

    private Set<PlayerRecordDto> playerRecords;

    public PlayerDto(final String name, final String comments, final Set<PlayerRecord> playerRecords, final Long id) {
        this.name = name;
        this.comments = comments;
        this.id = id;
        this.playerRecords = playerRecords.stream().map(PlayerRecord::toPlayerRecordDto).collect
                (Collectors.toSet());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Set<PlayerRecordDto> getPlayerRecords() {
        return playerRecords;
    }

    public void setPlayerRecords(Set<PlayerRecordDto> playerRecords) {
        this.playerRecords = playerRecords;
    }

    public Long getId() {
        return id;
    }
}
