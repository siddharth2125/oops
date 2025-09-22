#!/bin/bash
read -p "Enter a positive integer less than 100: " number
if (( number > 0 && number < 100 )); then
  for ((i=100; i>=1; i--)); do
    if (( i % number == 0 )); then
      echo "$i"
    fi
  done
else
  echo "Invalid input"
fi
