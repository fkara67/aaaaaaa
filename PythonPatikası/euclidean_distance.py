import math


def euclidean_distance(points):
    """
    :type points: points: tuple
    """
    distances = []
    for i in range(len(points) - 1):
        for j in range(i + 1, len(points)):
            distance = math.sqrt(((points[j][0] - points[i][0]) ** 2 + (points[j][1] - points[i][1]) ** 2))
            distances.append(distance)

    return distances


points = [(1, 2), (4, 6), (4, 9), (1, 2)]
min_distance = min(euclidean_distance(points))
print(f"Minimum distance : {min_distance}")
