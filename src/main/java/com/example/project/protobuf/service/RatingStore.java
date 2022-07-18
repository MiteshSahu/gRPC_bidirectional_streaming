package com.example.project.protobuf.service;

public interface RatingStore {
    Rating Add(String laptopID, double score);
}