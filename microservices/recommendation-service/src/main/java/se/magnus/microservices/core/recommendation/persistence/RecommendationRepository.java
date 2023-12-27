package se.magnus.microservices.core.recommendation.persistence;

import org.springframework.data.repository.CrudRepository;
import se.magnus.api.core.recommendation.Recommendation;

import java.util.List;

public interface RecommendationRepository extends CrudRepository<RecommendationEntity, String> {
    List<RecommendationEntity> findByProductId(int productId);
}
