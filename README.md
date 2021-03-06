# Hacker Rank 

[![Build Status](https://www.travis-ci.com/fordchastain/Hacker-Rank.svg?branch=main)](https://www.travis-ci.com/fordchastain/Hacker-Rank/)
[![codecov](https://codecov.io/gh/fordchastain/Hacker-Rank/branch/main/graphs/badge.svg)](https://codecov.io/gh/fordchastain/Hacker-Rank/)

This is a compilation of my solutions to HackerRank problems solved in Java.

## How to install

```
$ git clone https://github.com/fordchastain/Hacker-Rank.git
$ cd Hacker-Rank
$ mvn install
```

## How to run

```
$ mvn exec:java -Dexec.args="<problem name>"
```

where `<problem name>` is the name of the problem from the list of problems below:

### simple-array-sum

Check out the problem description **[here](https://www.hackerrank.com/challenges/simple-array-sum/problem)**.

**Input example:**
```
$ mvn exec:java -Dexec.args="simple-array-sum"
$ 6
$ 1 2 3 4 10 11
```

**Output example:**
```
$ 31
```

### compare-the-triplets

Check out the problem description **[here](https://www.hackerrank.com/challenges/compare-the-triplets/problem)**.

**Input example:**
```
$ mvn exec:java -Dexec.args="compare-the-triplets"
$ 17 28 30
$ 99 16 8
```

**Output example:**
```
$ 2 1
```

### birthday-cake-candles

Check out the problem description **[here](https://www.hackerrank.com/challenges/birthday-cake-candles/problem)**.

**Input example:**
```
$ mvn exec:java -Dexec.args="birthday-cake-candles"
$ 4
$ 3 2 1 3
```

**Output example:**
```
$ 2
```

### time-conversion

Check out the problem description **[here](https://www.hackerrank.com/challenges/time-conversion/problem)**.

**Input example:**
```
$ mvn exec:java -Dexec.args="time-conversion"
$ 07:05:45PM
```

**Output example:**
```
$ 19:05:45
```

### lisa-workbook

Check out the problem description **[here](https://www.hackerrank.com/challenges/lisa-workbook/problem)**.

**Input example:**
```
$ mvn exec:java -Dexec.args="lisa-workbook"
$ 5 3
$ 4 2 6 1 10
```

**Output example:**
```
$ 4
```

### grading

Check out the problem description **[here](https://www.hackerrank.com/challenges/grading/problem)**.

**Input example:**
```
$ mvn exec:java -Dexec.args="grading"
$ 4
$ 73
$ 67
$ 38
$ 33
```

**Output example:**
```
$ 75
$ 67
$ 40
$ 33
```

### apple-and-orange

Check out the problem description **[here](https://www.hackerrank.com/challenges/apple-and-orange/problem)**.

**Input example:**
```
$ mvn exec:java -Dexec.args="apple-and-orange"
$ 7 11
$ 5 15
$ 3 2
$ -2 2 1
$ 5 -6
```

**Output example:**
```
$ 1
$ 1
```

### diagonal-difference

Check out the problem description **[here](https://www.hackerrank.com/challenges/diagonal-difference/problem)**.

**Input example:**
```
$ mvn exec:java -Dexec.args="diagonal-difference"
$ 3
$ 11 2 4
$ 4 5 6
$ 10 8 -12
```

**Output example:**
```
$ 15
```

### climbing-the-leaderboard

Check out the problem description **[here](https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem)**.

**Input example:**
```
$ mvn exec:java -Dexec.args="climbing-the-leaderboard"
$ 4
$ 100 90 90 80
$ 3
$ 70 80 105
```

**Output example:**
```
$ 4
$ 3
$ 1
```

### the-hurdle-race

Check out the problem description **[here](https://www.hackerrank.com/challenges/the-hurdle-race/problem)**.

**Input example:**
```
$ mvn exec:java -Dexec.args="the-hurdle-race"
$ 5 4
$ 1 6 3 5 2
```

**Output example:**
```
$ 2
```

### organizing-containers-of-balls

Check out the problem description **[here](https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem)**.

**Input example:**
```
$ mvn exec:java -Dexec.args="organizing-containers-of-balls"
$ 2
$ 2
$ 1 1
$ 1 1
$ 2
$ 0 2
$ 1 1
```

**Output example:**
```
$ Possible
$ Impossible
```

### plus-minus

Check out the problem description **[here](https://www.hackerrank.com/challenges/plus-minus/problem)**.

**Input example:**
```
$ mvn exec:java -Dexec.args="plus-minus"
$ 6
$ -4 3 -9 0 4 1
```

**Output example:**
```
$ 0.500000
$ 0.333333
$ 0.166667
```