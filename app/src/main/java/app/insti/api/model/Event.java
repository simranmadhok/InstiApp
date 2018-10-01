package app.insti.api.model;

import android.support.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

public class Event {
    @NonNull()
    @SerializedName("id")
    private String eventID;

    @SerializedName("str_id")
    private String eventStrID;

    @SerializedName("name")
    private String eventName;

    @SerializedName("description")
    private String eventDescription;

    @SerializedName("image_url")
    private String eventImageURL;

    @SerializedName("start_time")
    private Timestamp eventStartTime;

    @SerializedName("end_time")
    private Timestamp eventEndTime;

    @SerializedName("all_day")
    private boolean allDayEvent;

    @SerializedName("venues")
    private List<Venue> eventVenues;

    @SerializedName("bodies")
    private List<Body> eventBodies;

    @SerializedName("interested_count")
    private int eventInterestedCount;

    @SerializedName("going_count")
    private int eventGoingCount;

    @SerializedName("interested")
    private List<User> eventInterested;

    @SerializedName("going")
    private List<User> eventGoing;

    @SerializedName("website_url")
    private String eventWebsiteURL;

    @SerializedName("user_ues")
    private int eventUserUes;

    private boolean eventBigImage = false;

    public Event(String eventID, String eventStrID, String eventName, String eventDescription, String eventImageURL, Timestamp eventStartTime, Timestamp eventEndTime, boolean allDayEvent, List<Venue> eventVenues, List<Body> eventBodies, int eventInterestedCount, int eventGoingCount, List<User> eventInterested, List<User> eventGoing, String eventWebsiteURL, int eventUserUes) {
        this.eventID = eventID;
        this.eventStrID = eventStrID;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventImageURL = eventImageURL;
        this.eventStartTime = eventStartTime;
        this.eventEndTime = eventEndTime;
        this.allDayEvent = allDayEvent;
        this.eventVenues = eventVenues;
        this.eventBodies = eventBodies;
        this.eventInterestedCount = eventInterestedCount;
        this.eventGoingCount = eventGoingCount;
        this.eventInterested = eventInterested;
        this.eventGoing = eventGoing;
        this.eventWebsiteURL = eventWebsiteURL;
        this.eventUserUes = eventUserUes;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventStrID() {
        return eventStrID;
    }

    public void setEventStrID(String eventStrID) {
        this.eventStrID = eventStrID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventImageURL() {
        // Fallback to body image if event has no image
        if (eventImageURL == null) {
            return getEventBodies().get(0).getBodyImageURL();
        }
        return eventImageURL;
    }

    public void setEventImageURL(String eventImageURL) {
        this.eventImageURL = eventImageURL;
    }

    public Timestamp getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(Timestamp eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public Timestamp getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(Timestamp eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    public boolean isAllDayEvent() {
        return allDayEvent;
    }

    public void setAllDayEvent(boolean allDayEvent) {
        this.allDayEvent = allDayEvent;
    }

    public List<Venue> getEventVenues() {
        return eventVenues;
    }

    public void setEventVenues(List<Venue> eventVenues) {
        this.eventVenues = eventVenues;
    }

    public List<Body> getEventBodies() {
        return eventBodies;
    }

    public void setEventBodies(List<Body> eventBodies) {
        this.eventBodies = eventBodies;
    }

    public int getEventInterestedCount() {
        return eventInterestedCount;
    }

    public void setEventInterestedCount(int eventInterestedCount) {
        this.eventInterestedCount = eventInterestedCount;
    }

    public int getEventGoingCount() {
        return eventGoingCount;
    }

    public void setEventGoingCount(int eventGoingCount) {
        this.eventGoingCount = eventGoingCount;
    }

    public List<User> getEventInterested() {
        return eventInterested;
    }

    public void setEventInterested(List<User> eventInterested) {
        this.eventInterested = eventInterested;
    }

    public List<User> getEventGoing() {
        return eventGoing;
    }

    public void setEventGoing(List<User> eventGoing) {
        this.eventGoing = eventGoing;
    }

    public String getEventWebsiteURL() {
        return eventWebsiteURL;
    }

    public void setEventWebsiteURL(String eventWebsiteURL) {
        this.eventWebsiteURL = eventWebsiteURL;
    }

    public int getEventUserUes() {
        return eventUserUes;
    }

    public void setEventUserUes(int eventUserUes) {
        this.eventUserUes = eventUserUes;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    public boolean isEventBigImage() {
        return eventBigImage;
    }

    public void setEventBigImage(boolean eventBigImage) {
        this.eventBigImage = eventBigImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(eventID, event.eventID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventID);
    }
}
