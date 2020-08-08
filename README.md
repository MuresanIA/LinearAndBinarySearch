Binary Search Documentation:

Search a sorted array by repeatedly dividing the search interval in half.
Begin with an interval covering the whole array.
If the value of the search key is less than the item in the middle of the interval,
narrow the interval to the lower half. Otherwise narrow it to the upper half.
Repeatedly check until the value is found or the interval is empty.

The idea of binary search is to use the information that the array is sorted and reduce the time complexity
to O(Log n).

We basically ignore half of the elements just after one comparison.
  
Compare x with the middle element.
If x matches with middle element, we return the mid index.
Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
Else (x is smaller) recur for the left half.


Linear Search Documentation:


What is Linear Search Algorithm?
In computer science, a linear search or sequential search is a method for finding an element within a list.
It sequentially checks each element of the list until a match is found or the whole list has been searched.

The complexity of Linear Search Algorithm is O(n)

Problem:
Given an array arr[] of n elements, write a function to search a given element x in arr[].

Approach:
Start from the leftmost element of array[] and one by one compare x with each element of array[]
If x matches with an element, return the index.
If x doesn’t match with any of elements, return -1.

What is Big O Notation?

Big O notation is used in Computer Science to describe the performance or complexity of an algorithm.
Big O specifically describes the worst-case scenario, and can be used to describe the execution time required or
the space used (e.g. in memory or on disk) by an algorithm.
