package fr.adgsoftware.point_hebdo.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false)
    private LocalDateTime creationTime;

    private LocalDateTime modificationTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(LocalDateTime modificationTime) {
        this.modificationTime = modificationTime;
    }

    @PrePersist
    protected void onCreate() {
        this.creationTime = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.modificationTime = LocalDateTime.now();
    }
}