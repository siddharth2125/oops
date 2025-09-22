#!/bin/bash
read -p "Enter a natural number: " number
if [[ $number -gt 0 ]]; then
  for ((i=1; i<=number; i++)); do
    if (( i % 2 == 0 )); then
      echo "$i is Even"
    else
      echo "$i is Odd"
    fi
  done
else
  echo "$number is not a natural number"
fi
