package dtos;

public class RouteDTO {

    private int routeId;
    private String start, end;

    public RouteDTO(int routeId, String start, String end) {
        this.routeId = routeId;
        this.start = start;
        this.end = end;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "RouteDTO{" + "routeId=" + routeId + ", start=" + start + ", end="
                + end + '}';
    }

}
