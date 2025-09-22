#!/bin/bash
read -p "Enter a positive integer: " n
if (( n > 0 )); then
  for ((i=1; i<=n; i++)); do
    if (( i % 15 == 0 )); then
      echo "FizzBuzz"
    elif (( i % 3 == 0 )); then
      echo "Fizz"
    elif (( i % 5 == 0 )); then
      echo "Buzz"
    else
      echo "$i"
    fi
  done
else
  echo "Not a positive integer"
fi
