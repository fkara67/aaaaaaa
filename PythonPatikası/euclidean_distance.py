import math


def euclidean_distance(points):
    """
    :type points: points: tuple
    """
    distances = []
    for i in range(len(points) - 1):
        distances.append(math.sqrt(((points[i + 1][0] - points[i][0]) ** 2 + (points[i + 1][1] - points[i][1]) ** 2)))

    return distances


points = [(1, 2), (4, 6), (5, 6)]
min_distance = min(euclidean_distance(points))
print(f"Minimum distance : {min_distance}")

