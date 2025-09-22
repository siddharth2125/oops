#!/bin/bash
read -p "Enter a positive integer: " number
if (( number > 0 )); then
  for ((i=1; i<=number; i++)); do
    if (( number % i == 0 )); then
      echo "$i"
    fi
  done
else
  echo "Not a positive integer"
fi
