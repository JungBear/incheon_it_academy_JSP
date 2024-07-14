export function convertWindSpeed(sppedInMetersPerSecond : number) : string{
    const sppedInKilometersPerSecond = (sppedInMetersPerSecond * 3.6).toFixed(1);
    return `${sppedInKilometersPerSecond}km/h`;
}