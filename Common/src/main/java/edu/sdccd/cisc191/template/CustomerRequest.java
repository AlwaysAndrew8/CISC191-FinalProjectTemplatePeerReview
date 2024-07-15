package edu.sdccd.cisc191.template;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;


// CustomerRequest class represents a request for customer data.
public class CustomerRequest {
    private Integer id;

    @JsonIgnore
    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Converts a CustomerRequest object to a JSON string.
    public static String toJSON(CustomerRequest customer) throws Exception {
        return objectMapper.writeValueAsString(customer);
    }

    // Converts a JSON string to a CustomerRequest object.
    public static CustomerRequest fromJSON(String input) throws Exception{
        return objectMapper.readValue(input, CustomerRequest.class);
    }
    protected CustomerRequest() {}

    /**
     * Constructs a CustomerRequest with an ID.
     *
     * @param id the customer's ID
     */
    public CustomerRequest(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d]",
                id);
    }

    // Getter and Setter methods
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}