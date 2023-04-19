package edu.iu.c322.assetmanagement.assetservice.repository;

import edu.iu.c322.assetmanagement.assetservice.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Integer> {
}
