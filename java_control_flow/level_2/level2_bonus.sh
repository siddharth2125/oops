#!/bin/bash
read -p "Enter salary: " salary
read -p "Enter years of service: " years
if (( years > 5 )); then
  bonus=$(echo "$salary * 0.05" | bc)
  echo "Bonus = $bonus"
else
  echo "No bonus"
fi
