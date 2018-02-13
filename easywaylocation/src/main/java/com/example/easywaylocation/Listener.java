package com.example.easywaylocation;

/**
 * Created by prabhat on 11/2/18.
 */

/**
 * Callback that can be implemented in order to listen for events
 */

public interface Listener {
    void locationOn();

    void onPositionChanged();

    void locationCancelled();
}
