# Find the smallest element in the unsorted portion and place it at the beginning of that portion.

# TC = O(n^2)


def selection_sort(arr):
    n = len(arr)

    for i in range(n):
        min_idx = i

        for j in range(i + 1, n):
            if arr[j] < arr[min_idx]:
                min_idx = j

        arr[i], arr[min_idx] = arr[min_idx], arr[i]

    return arr


arr = [5, 3, 8, 2, 1]

print(selection_sort(arr))
