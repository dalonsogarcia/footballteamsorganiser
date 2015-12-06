package core.entities;


/**
 * Created by tommylii on 04/12/2015.
 */


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    private Long photoId;

    private String comments;
    
    @OneToMany(mappedBy = "player",cascade = CascadeType.ALL)
    private Set<PlayerRecord> playerRecords;

    public Player(){
    }

    public Player(final String name) {
        this.name = name;
        photoId = 0L;
        comments = "";
        playerRecords = new HashSet<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Long photoId) {
        this.photoId = photoId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Set<PlayerRecord> getPlayerRecords() {
        return playerRecords;
    }

    public void setPlayerRecords(Set<PlayerRecord> playerRecords) {
        this.playerRecords = playerRecords;
    }
}
