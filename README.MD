my-first-java-class66

```mermaid
classDiagram
    class Person {
        -String firstName
        -String lastName
        -String idNumber
        -int birthYear
        -String countryOfBirth
        -char gender
        +void printAttributes()
    }

    object person1 as "Person1: Person"
    person1 : firstName = "Mike"
    person1 : lastName = "Wazowski"
    person1 : idNumber = "1111111111"
    person1 : birthYear = 1980
    person1 : countryOfBirth = "Neverland"
    person1 : gender = 'H'

    object person2 as "Person2: Person"
    person2 : firstName = "Sully"
    person2 : lastName = "Salt"
    person2 : idNumber = "2222222222"
    person2 : birthYear = 1983
    person2 : countryOfBirth = "Neverland"
    person2 : gender = 'H'

    person1 --|> Person
    person2 --|> Person
```
