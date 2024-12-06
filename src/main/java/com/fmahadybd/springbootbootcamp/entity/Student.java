package com.fmahadybd.springbootbootcamp.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * - Note: Lombok Give some problem on here. So we need create it in manual way
 */
@Entity
@Table(name = "students")
//
/**
 * The @Data annotati@NoArgsConstructor
 * //@AllArgsConstructor
 * //@Data
 * //@Getter
 * //@Setteron from Lombok generates:
 * - Getter and Setter methods for all fields.
 * - A toString() method.
 * - equals() and hashCode() methods.
 *
 * However, @Data does not generate constructors. The constructors are provided by:
 * - @NoArgsConstructor: Creates a default constructor with no arguments.
 * - @AllArgsConstructor: Creates a constructor that takes all fields as parameters.
 */
public class Student {

    /**
     * The 'id' field is an Integer wrapper class.
     * It stores a reference to an Integer object, not the value itself.
     * It can hold null values and provides utility methods like Integer.parseInt() and Integer.valueOf().
     * The 'id' field can be null, which is useful when a Student object is created but not yet persisted in the database
     * (e.g., the 'id' may not be assigned until it is saved in the database).
     */


    /**
     * IDENTITY:
     * The database automatically generates the primary key value using an auto-increment field.
     * The database itself handles key generation, and the entity will not explicitly set the 'id' value.
     * This strategy is commonly used in databases where an auto-increment property is available.
     *
     * AUTO:
     * The persistence provider (Hibernate) will choose an appropriate generation strategy based on the underlying database.
     * It can use IDENTITY, SEQUENCE, or TABLE depending on the database and its configuration.
     * AUTO is flexible and allows the persistence provider to decide on the best strategy.
     */

//    @Column(length = 30, nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 30)
    private String name;
    private String email;
    private String cellNo;

    public Student() {

    }

    public Student(Integer id, String name, String email, String cellNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cellNo = cellNo;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }



    /**
     * @Column:
     * - unique = true: Ensures the column must have unique values.
     * - insertable = true: Specifies whether the column should be included in SQL INSERT statements (default is true).
     * - updatable = false: Specifies whether the column should be included in SQL UPDATE statements (default is true).
     * - columnDefinition = "VARCHAR(255) DEFAULT 'Unknown'": Specifies a custom SQL fragment used for the column definition (e.g., VARCHAR or INT).
     */

}
