# Garden Pest Removal

## Problem Statement
Create a function named **gardenPestRemoval** that receives **garden** and **threshold** as its parameters.

This function simulates the removal of pests from a garden represented as a 2D array of integers.  
Each cell value in the garden array represents the number of pests in that section of the garden.

## Steps to Calculate the Total Pest Count

1. **Iterate through each cell** in the garden array.
2. **For each cell:**
   - Calculate the sum of the pest counts in the surrounding cells: **up, down, left, right**.
   - **Check** if the sum of these surrounding pest counts is less than or equal to the given **threshold**.
   - **If the condition is met**, add the pest count of the current cell to the total pest count.
3. **After processing all cells:**
   - Reverse the digits of the total pest count to obtain the final output.

## Parameters

- **garden (int[][]):**  
  A 2D array representing different sections of a garden.  
  - Each cell contains a non-negative integer indicating the number of pests in that section.  
  - The maximum size of the garden array is 10x10.

- **threshold (int):**  
  A non-negative integer representing the maximum allowed sum of pest counts in the surrounding cells for a cell to be included in the total pest count.

- **Return Value:**  
  The function returns an integer which is the reversed digits of the total pest count calculated based on the provided rules.

## Example Arguments and Expected Outputs

- **Arguments:**  
  `garden = [[0, 0], [0, 0]]`  
  `threshold = 0`  
  **Expected Output:** `0`

- **Arguments:**  
  `garden = [[1, 1], [1, 1]]`  
  `threshold = 4`  
  **Expected Output:** `4`

- **Arguments:**  
  `garden = [[1, 2], [3, 4]]`  
  `threshold = 10`  
  **Expected Output:** `1`

- **Arguments:**  
  `garden = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]`  
  `threshold = 15`  
  **Expected Output:** `62`

- **Arguments:**  
  `garden = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]`  
  `threshold = 20`  
  **Expected Output:** `51`

- **Arguments:**  
  `garden = [[1, 1, 1, 1, 1], [1, 2, 2, 2, 1], [1, 2, 3, 2, 1], [1, 2, 2, 2, 1], [1, 1, 1, 1, 1]]`  
  `threshold = 6`  
  **Expected Output:** `42`

- **Arguments:**  
  `garden = [[10, 20, 30, 40, 50], [20, 30, 40, 50, 60], [30, 40, 50, 60, 70], [40, 50, 60, 70, 80], [50, 60, 70, 80, 90]]`  
  `threshold = 150`  
  **Expected Output:** `23`

- **Arguments:**  
  `garden = [[100, 200, 300, 400, 500], [200, 300, 400, 500, 600], [300, 400, 500, 600, 700], [400, 500, 600, 700, 800], [500, 600, 700, 800, 900]]`  
  `threshold = 1000`  
  **Expected Output:** `12`