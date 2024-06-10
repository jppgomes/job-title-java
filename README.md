# JobTitleNormalizer

JobTitleNormalizer is a Java project designed to normalize job titles based on a provided list of normalized job titles. This project demonstrates good Object-Oriented Programming principles, defensive coding, and unit testing.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven
- An IDE such as IntelliJ IDEA or Eclipse

### Installation

1. **Clone the repository:**

    ```sh
    git clone https://github.com/your-username/JobTitleNormalizer.git
    cd JobTitleNormalizer
    ```

2. **Open the project in your IDE:**

    - Open your IDE and import the project as a Maven project.

3. **Build the project:**

    - In your IDE, run the Maven build to download dependencies and compile the project.

## Usage

To run the normalization process, execute the `Normaliser` class. You can run it directly from your IDE.

### Running Tests
To run the unit tests, execute the NormaliserTest class. You can run it directly from your IDE.

### Example

```java
public class Main {
    public static void main(String[] args) {
        Normaliser n = new Normaliser();
        String[] testTitles = {"Java engineer", "C# engineer", "Chief Accountant", "Accountant"};

        for (String title : testTitles) {
            System.out.println("Input: " + title + " -> Normalized: " + n.normalise(title));
        }
    }
}


