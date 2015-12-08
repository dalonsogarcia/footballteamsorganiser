package core.dto;

import core.entities.TeamType;

/**
 * Created by tommylii on 08/12/2015.
 */
public class PlayerRecordDto {
    private final String comments;
    private final TeamType team;
    private final int goals;
    private final Long id;

    public PlayerRecordDto(final String comments, final TeamType team, final int goals, final Long id) {

        this.comments = comments;
        this.team = team;
        this.goals = goals;
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public TeamType getTeam() {
        return team;
    }

    public int getGoals() {
        return goals;
    }

    public Long getId() {
        return id;
    }
}
