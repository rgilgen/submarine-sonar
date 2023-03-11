# submarine-sonar

## Learnings
* Achte auf Naming
* Vergesse nicht Single Responsibility Principle
* Refactoring, sobald die Tests grün sind, verschiebe es nicht auf später
* Formatiere korrekt
* ChatGPT hatte auch Fehler

## Kata Aufgabe - Advent of Code 2021 Day 1

https://adventofcode.com/2021/day/1

## --- Day 1: Sonar Sweep ---

As the submarine drops below the surface of the ocean, it automatically performs a sonar
sweep of the nearby sea floor. On a small screen, the sonar sweep report (your puzzle input)
appears: each line is a measurement of the sea floor depth as the sweep looks further and
further away from the submarine.

For example, suppose you had the following report:

199\
200\
208\
210\
200\
207\
240\
269\
260\
263\

This report indicates that, scanning outward from the submarine, the sonar sweep found
depths of 199, 200, 208, 210, and so on.\
The first order of business is to figure out how quickly the depth increases, just so you know
what you're dealing with - you never know if the keys will get carried into deeper water by an
ocean current or a fish or something.\
To do this, count the number of times a depth measurement increases from the previous
measurement. (There is no measurement before the first measurement.) In the example
above, the changes are as follows:\
199 (N/A - no previous measurement)\
200 (increased)\
208 (increased)\
210 (increased)\
200 (decreased)\
207 (increased)\
240 (increased)\
269 (increased)\
260 (decreased)\
263 (increased)\
In this example, there are 7 measurements that are larger than the previous measurement.
How many measurements are larger than the previous measurement?\

## Schwerpunkte der Kata

In dieser Kata auf diese Schwerpunkte konzentrieren:\
- Lesbarkeit\
- Testdriven (TDD)\
##  Constraint: Minimalistic Coder\
  ● Work in pairs\
  ● Person A only writes tests\
  ● Person B tries to get the tests to pass with absolute minimalist code (that\
  doesn’t need to actually implement the specification)\
  ● Both refactor when appropriate\
  The goal is to practice writing tests that drive the implementation into a certain direction.\
