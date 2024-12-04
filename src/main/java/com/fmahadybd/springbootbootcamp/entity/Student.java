package com.fmahadybd.springbootbootcamp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Data
/**
 * The @Data annotation from Lombok generates:
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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

    @Column(length = 30, nullable = false)
    private String name;

    /**
     * @Column:
     * - unique = true: Ensures the column must have unique values.
     * - insertable = true: Specifies whether the column should be included in SQL INSERT statements (default is true).
     * - updatable = false: Specifies whether the column should be included in SQL UPDATE statements (default is true).
     * - columnDefinition = "VARCHAR(255) DEFAULT 'Unknown'": Specifies a custom SQL fragment used for the column definition (e.g., VARCHAR or INT).
     */
    private String email;

    private String cellNo;
}
