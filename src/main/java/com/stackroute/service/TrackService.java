package com.stackroute.service;

import com.stackroute.domain.Track;

import com.stackroute.exception.IdNotFoundException;
import com.stackroute.exception.TracNotFoundException;
import com.stackroute.exception.TrackAlreadyExistsException;


import java.util.List;


public interface TrackService {
    public Track saveTrack(Track track)throws TrackAlreadyExistsException;
    public List<Track> getAllTracks();
    public boolean deleteTrack(int id)throws TracNotFoundException;
    public Track updateTrack(Track track) throws IdNotFoundException;



}
