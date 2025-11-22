AlgorithmToolkit – Mini Project 3

This project contains a small Java utility library that includes basic algorithms and data-structure implementations. It was created as part of Mini Project 3 for the Data Structures & Algorithms course.

📌 Features

SortingUtil
Implements four sorting algorithms:

Bubble Sort

Insertion Sort

Merge Sort

Quick Sort

SearchUtil
Two search methods:

Linear Search

Binary Search (requires sorted array)

CollectionUtil
Generic data-structure utilities:

Stack

Queue

AnalysisUtil
Simple benchmarking function to measure algorithm execution time.

📁 Project Structure com.training.toolkit ├── SortingUtil.java ├── SearchUtil.java ├── CollectionUtil.java └── AnalysisUtil.java

🧪 Testing

Includes JUnit test cases for:

Sorting algorithms

Search algorithms

Stack & Queue

Benchmarking tool

Run all tests using:

mvn test

▶ Example int[] arr = {5, 2, 8};

SortingUtil.quickSort(arr); int index = SearchUtil.binarySearch(arr, 5);

System.out.println(Arrays.toString(arr)); // [2, 5, 8] System.out.println("Index: " + index);

✔ Maven Dependencies

Add to pom.xml:

JUnit org.junit.jupiter junit-jupiter 5.9.0 test

Servlet API (if using in a web project) jakarta.servlet jakarta.servlet-api 5.0.0 provided

👨‍💻 Author

Ahamed Irfan Mini Project 3 – Algorithm Toolkit
