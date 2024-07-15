package edu.sdccd.cisc191.template;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

// CustomerResponse class represents a response for customer data.
public class CustomerResponse {
    private Integer id;
    private String firstName;
    private String lastName;

    @JsonIgnore
    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Converts a CustomerResponse object to a JSON string.
    public static String toJSON(CustomerResponse customer) throws Exception {
        return objectMapper.writeValueAsString(customer);
    }

    // Converts a JSON string to a CustomerResponse object
    public static CustomerResponse fromJSON(String input) throws Exception{
        return objectMapper.readValue(input, CustomerResponse.class);
    }

    protected CustomerResponse() {}

    /**
     * Constructs a CustomerResponse with the following.
     *
     * @param id the customer's ID
     * @param firstName the customer's first name
     * @param lastName the customer's last name
     */
    public CustomerResponse(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

    // Getter and Setter methods
    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}