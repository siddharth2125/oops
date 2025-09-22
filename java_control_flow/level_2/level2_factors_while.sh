#!/bin/bash
read -p "Enter a positive integer: " number
if (( number > 0 )); then
  i=1
  while (( i <= number )); do
    if (( number % i == 0 )); then
      echo "$i"
    fi
    ((i++))
  done
else
  echo "Not a positive integer"
fi
