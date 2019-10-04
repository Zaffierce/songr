package com.Zaffierce.songr.Emotions;

import com.Zaffierce.songr.Emotions.Emotion;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository takes in a T for Type and an Identifier type
public interface EmotionRepository extends JpaRepository<Emotion, Long> {
}
