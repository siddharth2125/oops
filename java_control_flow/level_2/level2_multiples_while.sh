#!/bin/bash
read -p "Enter a positive integer less than 100: " number
if (( number > 0 && number < 100 )); then
  i=100
  while (( i >= 1 )); do
    if (( i % number == 0 )); then
      echo "$i"
    fi
    ((i--))
  done
else
  echo "Invalid input"
fi
