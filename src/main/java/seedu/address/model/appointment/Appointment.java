package seedu.address.model.appointment;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;

/**
 * Represents an Appointment in the appointment book. Guarantees: details are present and not null, field values are
 * validated, immutable.
 */
public class Appointment {

    // Identity fields
    private final int patientId;
    private final String datetime;

    // Data fields

    /**
     * Every field must be present and not null.
     */
    public Appointment(int patientId, String datetime) {
        requireAllNonNull(patientId, datetime);
        this.patientId = patientId;
        this.datetime = datetime;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getDatetime() {
        return datetime;
    }

    /**
     * Returns true if both appointments have the same name and datetime. This defines a weaker notion of equality
     * between two appointments.
     */
    public boolean isSameAppointment(Appointment otherAppointment) {
        if (otherAppointment == this) {
            return true;
        }

        return otherAppointment != null && otherAppointment.getPatientId() == getPatientId()
            && otherAppointment.getDatetime().equals(getDatetime());
    }

    /**
     * Returns true if both appointments have the same identity and data fields. This defines a stronger notion of
     * equality between two appointments.
     */
    @Override public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Appointment)) {
            return false;
        }

        Appointment otherAppointment = (Appointment) other;
        return otherAppointment.getPatientId() == (getPatientId()) && otherAppointment.getDatetime()
            .equals(getDatetime());
    }

    @Override public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(patientId, datetime);
    }

    @Override public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(getPatientId()).append("; Datetime: ").append(getDatetime());
        return builder.toString();
    }

}
