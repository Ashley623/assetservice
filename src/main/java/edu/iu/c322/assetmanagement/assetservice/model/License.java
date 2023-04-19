package edu.iu.c322.assetmanagement.assetservice.model;

import jakarta.persistence.Transient;

public record License( int id,
         String description,

         int organizationId,
         String licenseType,

         String comment,

         String organizationName,

         String contactName,

         String contactPhone,

         String contactEmail) {
}
