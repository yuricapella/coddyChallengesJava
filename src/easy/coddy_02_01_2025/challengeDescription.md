# Garden Party Seating Rearrangement

## Description
Create a function named `rearrangeSeating` that receives `seatingArrangement` and `seatingChanges` as parameters.

This function updates the seating arrangement at Lea's garden party based on guest arrivals and departures.

## Steps
1. Iterate through each element of the `seatingChanges` array.
2. Update the corresponding table's seating count in the `seatingArrangement` array by adding the change value.
3. Return the updated `seatingArrangement` array.

## Parameters
- **seatingArrangement (int[])**: Initial seating arrangement, where each element indicates the number of guests seated at a particular table.
- **seatingChanges (int[])**: Changes in the number of guests at each table, where positive values indicate arrivals and negative values indicate departures.

The function returns an `int[]` representing the updated seating arrangement after applying the changes.

## Test Cases

| Seating Arrangement      | Seating Changes         | Expected Output      |
|--------------------------|-------------------------|----------------------|
| [1, 2, 3]               | [0, 0, 0]               | 1,2,3                |
| [10, 5, 8]              | [2, -3, 1]              | 12,2,9               |
| [20, 15, 25]           | [-5, -5, -5]            | 15,10,20             |
| [0, 0, 0]              | [1, 1, 1]               | 1,1,1                |
| [100, 200, 300]        | [50, -50, 100]          | 150,150,400          |
| [10, 20, 30, 40, 50]   | [5, -10, 15, -20, 25]   | 15,10,45,20,75       |
| [1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000] | [-500, 1000, -1500, 2000, -2500, 3000, -3500, 4000] | 500,3000,1500,6000,2500,9000,3500,12000 |
| [5, 10, 15, 20, 25, 30, 35] | [2, -3, 4, -5, 6, -7, 8] | 7,7,19,15,31,23,43 |

