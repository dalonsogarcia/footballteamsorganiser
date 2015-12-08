package core.dto;

import java.util.Date;
import java.util.Set;

/**
 * Created by tommylii on 08/12/2015.
 */
public class GameRecordDto {

    private final String comments;
    private final Date date;
    private final String location;
    private final Set<PlayerRecordDto> playerRecords;
    private final Long id;

    public GameRecordDto(final String comments, final Date date, final String location, final Set<PlayerRecordDto> playerRecords, Long id) {
        this.comments = comments;
        this.date = date;
        this.location = location;
        this.playerRecords = playerRecords;
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public Date getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public Set<PlayerRecordDto> getPlayerRecords() {
        return playerRecords;
    }

    public Long getId() {
        return id;
    }
}
