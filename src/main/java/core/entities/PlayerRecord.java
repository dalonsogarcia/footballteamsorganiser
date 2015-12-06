package core.entities;


import javax.persistence.*;

/**
 * Created by tommylii on 04/12/2015.
 */
@Entity
public class PlayerRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int goals;

    @ManyToOne
    private Player player;

    private String comments;

    @ManyToOne
    private GameRecord gameRecord;

    private TeamType team;

    public PlayerRecord(final Player player, final GameRecord gameRecord, final TeamType team) {
        this.player = player;
        this.gameRecord = gameRecord;
        this.team = team;
    }

    public PlayerRecord() {

    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }


    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public TeamType getTeam() {
        return team;
    }

    public void setTeam(TeamType team) {
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public GameRecord getGameRecord() {
        return gameRecord;
    }

    public void setGameRecord(GameRecord gameRecord) {
        this.gameRecord = gameRecord;
    }
}
