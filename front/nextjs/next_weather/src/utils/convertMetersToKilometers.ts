export function convertMetersToKilometers(meters : number) : string {
    let kilometers = meters / 1000;
    return `${kilometers.toFixed(0)}km`;
}